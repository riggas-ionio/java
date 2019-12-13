#Python 3 code
import socket #To get network connection
import sys #To get argument info

if len(sys.argv)<2:
    print("Usage: python3 'HOST' PORT")
    sys.exit(1)
HOST = sys.argv[1]  # The server's hostname or IP address
PORT = 1080
if len(sys.argv)<3:
    print("Using default port: 1080")
else:
    PORT = int(sys.argv[2])        # The port used by the server

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.connect((HOST, PORT))
    print( 'Sending data..' )
    s.sendall(b'Hello Python world')
    print( 'Expecting response..' )
    data = s.recv(1024)

print('Received', repr(data))
