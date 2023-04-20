# ProxyDesignPattern

This pattern is used to introduce a proxy between client(main method) and the service class. The client makes calls to the proxy class, which in turn makes calls
to the service class. This helps to protect service class from malicious code.. This can be used for caching as well, and authentication, pre or post processing
etc.
