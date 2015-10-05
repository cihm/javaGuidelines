http://linux.vbird.org/linux_basic/0210filepermission.php
//===================================
在-rwxrwxr-- 1 acer acer 38 Run.sh
跑Run.sh需要用sh Run.sh
(因為沒權限，所以把Run.sh倒給sh跑)
=> chmod +x Run.sh
變-rwxrwxr-x 1 acer acer 38 Run.sh
就可以直接 ./Run.sh 

//=================================================

 |  = pipe (把前面程式的輸出當作下一個程式的輸入)
 
 //================================================
 
grep "original category" channelData.log


grep "com.acer.channel.Util.YlibDataUti" channelData.log  | grep "original"

grep "totalSize is null, so do while to download" channelData.log

grep -A 5 "name" Zinio-getItemListByCategoryCode-using.json |grep "商業"|head


//====================================
計算有多少東西在該目錄裡面

ls -f | wc -l

//
file size:
du -sbh

//
device size
df -hl
//==================
cp overwrite without ask

yes | cp -rf xxx yyy

//==================
 壓 tar -czf $backPath/channelData-jar-$today.tar.gz ChannelData.jar 
 看 tar -tzf 
 解 tar -xzf $backPath/channelData-jar-$today.tar.gz -C $srcPath/
//====================================
sudo scp -r /opt/cronjobs/channelData/data/ acer@210.241.135.97:/opt/app/abStore/data/
 //====================
scp ubuntu@52.26.198.4:/opt/app/abStore_data/data-20150803.tar.gz ./
//因為正式機有防火牆擋住，所以aws(ubuntu)不能傳東西過去，但是可以
//由正式機發送請求去aws拿東西
 
 

刪除此目錄內所有東西
rm -fr *
遞迴
//==========================
重啟tomcat  (給sudo 環境變數)
sudo env JAVA_HOME=/opt/jdk1.7.0 ./catalina.sh stop
sudo env JAVA_HOME=/opt/jdk1.7.0 ./catalina.sh start

acer@abstore:/opt$ cat /etc/rc.local
#!/bin/sh -e
    /opt/lampp/xampp start
    export JAVA_HOME=/opt/jdk1.7.0
    export JAVA_OPTS="-Xms2048m -Xmx4096m -XX:PermSize=512m -XX:MaxPermSize=1024m"
    sh /opt/tomcat-7.0.56/bin/startup.sh

//===================================
epayservice 
 sudo -E /opt/apache-tomcat-7.0.61/bin/startup.sh

 找出正在執行的線程
 ps aux | grep java 
 kill process
 sudo kill -9 1923
//==================================

/opt/tomcat-7.0.56/conf/Catalina/localhost 
linux 可以有很多 domain name ,跟localhost平行


//=======================
找指令位置
which $name

找檔案
find -iname "sonatype-work"

有時候因為權限的關係會找不到
//=============
切換使用者
su username
//========================
變更群組
chgrp $accountName $filename

變更權限
chown $accountName $filename

同時:
sudo chown -R ubuntu:ubuntu logs

//==================
環境變數:
set in $HOME/.bashrc
生效  . ~/.bashrc


