# corunfaultcheck 

this project use spring boot , mybatis , websocket and emqx(mqtt server) to show the fault image and location on the webpage(support chrome firfox Edge)


create mysql docker container

docker run --restart always --ip 172.18.0.2 -p 3306:3306 --name corunmysql  --network corun -e MYSQL_ROOT_PASSWORD=corundb -e MYSQL_DATABASE=corundb -v /mysql/info:/var/lib/mysql -d mysql:corun


create emqx docker container

docker run --restart always --ip 172.18.0.3 -p 1883:1883 -p 8081:8081 -p 8083:8083 -p 8084:8084 -p 8883:8883 -p 18083:18083  --name corunemqx --network corun -e EMQXVV=corun -d emqx/emqx:4.4.3

create nginx server

docker run --restart always --name corunnginx --network corun --ip 172.18.0.4 -p 8082:80 -d nginx
docker run --restart always --name corunnginx --network corun --ip 172.18.0.4 -p 8082:80 -v /opt/nginx/config/nginx.conf:/etc/nginx/nginx.conf -d nginx

docker run --restart always --name corunnginx --network corun --ip 172.18.0.4 -p 8082:80 -v /opt/nginx/config/nginx.conf:/etc/nginx/nginx.conf -v /opt/nginx/image/:/var/www/images -d nginx


open firewall 
sudo firewall-cmd --zone=public --add-port=1883/tcp --permanent
sudo firewall-cmd --zone=public --add-port=3306/tcp --permanent
sudo firewall-cmd --reload

use the eqmx client to push the data to topic  such as testtopic/#

based on the maven 3.8 and jdk 8



