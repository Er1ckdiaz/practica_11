#encoding: utf-8
#!/usr/bin/env python3

from socket import *
        
serverName = 'localhost' #127.0.0.1
serverPort  = 31000
clientSocket = socket(AF_INET, SOCK_DGRAM)

message = input("ingresar mensaje en minusculas: ")

clientSocket.sendto(bytes(message'utf-8')(serverName, serverPort))

modifiedMessage, serverAddress = clientSocket.recvfrom(2048)

print_("mensaje recibido del servidor: " + str(modiedMessage))

clientSocket.close()

        