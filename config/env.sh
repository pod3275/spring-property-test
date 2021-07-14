
# Set Env ########################
##################################
if [ -z $ENV_VALUE ]; then export ENV_VALUE="123"; fi
sed -i "s/%ENV_VALUE%/${ENV_VALUE}/g" /home/tmax/example.properties
