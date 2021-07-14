
# Set Env ########################
##################################
if [ -z $ENV_VALUE ]; then export ENV_VALUE="123"; fi
sed -i "s/%ENV_VALUE%/${ENV_VALUE}/g" /home/tmax/example.properties

if [ -z $SERVER_PORT ]; then export SERVER_PORT="8081"; fi
sed -i "s/%SERVER_PORT%/${SERVER_PORT}/g" /home/tmax/application.properties
