#Python 2 code
import socket
import thread

#Define listing socket and port
s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
s.connect(("8.8.8.8", 80))
IP = s.getsockname()[0]
PORT = 1080
s.close()

DATA_CNT = 0

def handle(client_socket, address):
    data = client_socket.recv(1024) #Read up to 1024 bytes
    print 'Received ', data #Echo received data to terminal
    resp = 'Thank you! '+str(DATA_CNT)
    client_socket.send(resp) #Send back response
    client_socket.close() #Terminate the socket connection

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind((IP,PORT))
server.listen(2)

print 'Listening on ', IP ,':', PORT
while True: # listen for incoming connections
    client_socket, address = server.accept()
    print "Connection from ip", address[0]
    DATA_CNT += 1
    # spawn a new thread that will execute handle()
    thread.start_new_thread(handle, (client_socket, address))
