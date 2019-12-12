#Python 3 code
import socket

HOST = '192.168.1.5'  # The server's hostname or IP address
PORT = 1080        # The port used by the server

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.connect((HOST, PORT))
    print( 'Sending data..' )
    s.sendall(b'Hello Python world')
    print( 'Expecting response..' )
    data = s.recv(1024)

print('Received', repr(data))
