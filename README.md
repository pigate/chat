chat
====

java tcp chat server/client

Configuration:

 - Replace port numbers with your designated ports. Try to choose ports upwards of 5000.

To run:
Ensure that server is running before client.

For Server:
javac TcpServer
java TcpServer

For Client
javac TcpClient
java TcpClient

Limitations:
Server and Client patiently take turn. Only when one sends message may other send message.

How to improve:
Have server and client poll continuously so that either may send message anytime.
Log messages into a file. Perhaps show the last * lines of the file in console.
