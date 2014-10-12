1. "method" and "var"
     first word must be lower //ex: getUserName
	 
2. class  is upper            //ex: GetUserName 

3. finally var is all upper, and use _ to separa 

4. String	test;
   if(test.equals("targer") )     X
   if("target" .equals(tset) )    O  recommend
   //if test = null , line 1 will nullPointerError,   
   //Never happened before because declare well
   
5. String final SIZE = 1000/300;
   String final SIZE_2 = 2.67; // Estimate   
   
====thread safy====


  
if want use static method in that class directly.

the pass value to this static method must be primary type(int, string)
                                    
because other type are call by reference.

the value will be change if another thread comes .

http://stackoverflow.com/questions/20510619/the-issue-about-call-by-reference-in-java

=====================

1. fix var  name,

2. follow  "originalCategoryHMAL"
        purpose    foWhat     type 

		
3. pull the key to class level  (Those key  which need uniform)   
   ex:
   newMap.put("Description", map.get("description"));
   
   
   String static final  DESCRIPTION_KEY = "Description";
   
   newMap.put(Description_key, map.get("description"));
		
=======================
10/9

1.OrganizeData.java 
  這支 要改 ，不要 construct,

  r zinioData  organizeZinioData 


2. Al al = (new Al()).add(object); //Carefully won't make small mistakes
            -----------------------
           這整陀非Al 所以不能,

   AL or =(new Orgina("channel" , object)).getData           ======================================== 	          這整陀為Al 所以可, 


===================
[trace]

ControllerBase.java 

line35 , (Reflection), (invoke)
		   
  





