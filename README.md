Interoperable Notification Service for Smartphones
==================================================

The messaging framework is introduced as a component that follows a client/server architecture, which can easily be integrated with any application server for sending JSON-based notifications to any mobile platform that implements a XMPP mobile client. Unlike GCM, APNS or MPNS, XMPP-based notification server is not constrained by number of messages that can be pushed to a mobile or a specific mobile platform.


Requirements
-------------

- Openfire or Jabber (Gateway broker) - [Here](https://gist.github.com/huberflores/5fe4c840bbb00ef030c5) you can find a guide to configure Openfire 3.7.1

- Maven2

- Web server



Installation
-------------

  $ git clone https://github.com/huberflores/XMPPNotificationServer.git

  $ cd ~/XMPPNotificationServer/

  $ mvn install

  $ cd ~/xmpp-notification/target/xmpp-notification/WEB-INF/

  $ nano web.xml

```xml
<web-app>
  <servlet>
    <servlet-name>xmppnotification</servlet-name>
    <servlet-class>ee.ut.notification.xmpp.server.RESTNotification</servlet-class>
  </servlet>

  <servlet-mapping>
    <servlet-name>xmppnotification</servlet-name>
    <url-pattern>/xmppnotification</url-pattern>
  </servlet-mapping>
</web-app>
```

Configure Openfire/XMPP server

$ ~/xmpp-notification/target/xmpp-notification

$ nano server.properties

```xml
server=your-xmpp-server
domain=your-xmpp-domain
```

Build war file

Locate war file within your Web server
