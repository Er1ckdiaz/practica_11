#encoding: utf-8
#!/usr/bin/env python3
        
from socket import*

serverPort  = 31000
serverSocket = socket(AF_INET, SOCK_DGRAM)
serverSocket.bind(('', serverPort))
print_("el servidor esta preparado paa recibir")

while 1:
    message, clientAddress = serverSocket.recvfrom(2048)
    modifiedMessage = message.upper()
    serverSocket.sendto(bytes(str(modifiedMessage),'utf-8'), clientAdress)
    break

print(".........conexion cerrada..........")
serverSocket.close()
