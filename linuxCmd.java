http://linux.vbird.org/linux_basic/0210filepermission.php
//===================================
在-rwxrwxr-- 1 acer acer 38 Run.sh
跑Run.sh需要用sh Run.sh
(因為沒權限，所以把Run.sh倒給sh跑)
=> chmod +x Run.sh
變-rwxrwxr-x 1 acer acer 38 Run.sh
就可以直接 ./Run.sh 

//====================================