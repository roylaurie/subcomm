subcomm
==============================================================================================================

A chat client library for A Simple Subspace Server (ASSS). Written in Java. BSD license.

This project is available at:
https://github.com/roylaurie/subcomm

The SubComm Web project provides a fully functioning HTML5 GUI using SubComm. It is available at:
https://github.com/roylaurie/subcomm-web

The project for the SubComm client applet is available at:
https://github.com/roylaurie/subcomm-web-client-applet

usage
-----
An example via code:

```java

SubcommClient client = new SubcommClient("127.0.0.1", 5005, "jsmith", "mypassword");
client.connect();
client.joinArena("0");
client.chatPublic("Hello world!");

while (client.connected()) {
    String message = client.nextReceivedMessage();
    if (message != null) {
        System.out.println(message);
    }

    Thread.sleep(350);
}

```

contributors
-------
* Roy Laurie <roy.laurie@gmail.com>

license (3bsd)
--------------

Copyright © 2012 Roy Laurie. All Rights Reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

3. The name of the author may not be used to endorse or promote products
   derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY ROY LAURIE SOFTWARE "AS IS" AND ANY EXPRESS OR IMPLIED
WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO
EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE.
