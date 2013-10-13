#This script must be run preferable within the application server side,
#in order to avoid unnecessary latencies
#./xmmpload.sh

for t in {1..24}
do
   #Send 3 messages per minute, 1 message each 20s
   for i in {1..3}
   do
     curl "http://localhost:8080/Notifier/xmppnotification?jidmobile=jidmobile@amazon-xmpp/Home&payload=OK"
     sleep 20s
   done
   #Refresh rate 
   sleep 1m #change  m=minutes, h=hours, d=days
done





