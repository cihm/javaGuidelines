
ControllerBase.java 

line35 , (Reflection), (invoke)



@Override
    protected void processPostRequest()
            throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	
        String oper = Toolets.parmGetter(request, "oper");
		//request from web , 
		//ex: url_path/getSomeData?oper=ordercook
		//                              =========
		
        if(Toolets.isEmpty(oper)){this.dispatchPageXML("<"+ERROR_TAG+">" + NO_OPERATION + "</"+ERROR_TAG+">");return;}
        try {
            Class objC = Class.forName(jobClassPath());
			//get class : ex :com.ws.module.GetDataJobs
			
			
			//http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
			//http://godleon.blogspot.tw/2007/09/class-class-java-class-class-jvm-class.html
			
			
            Method objM = objC.getMethod(
                    oper, 
                    new Class[]{
                        Class.forName("javax.servlet.http.HttpServletRequest"), 
                        Class.forName("javax.servlet.http.HttpServletResponse")}
						
					//method , method's arg1, arg2 	
            );
            objM.invoke(objC.newInstance(), new Object[]{request, response});
            controllerDispatchPageXML();
        } catch (java.lang.NoSuchMethodException e) {
            e.printStackTrace();
            this.dispatchPageXML("<"+ERROR_TAG+">" + NO_SUCH_METHOD_EXCEPTION + "</"+ERROR_TAG+">");
        } catch (Exception e) {
            e.printStackTrace();
            this.dispatchPageXML("<"+ERROR_TAG+">" + OTHER_ERROR + "</"+ERROR_TAG+">");
        }
    }
    
	
	//this will dispatch to new servlet Url
	//http://docs.oracle.com/cd/E19528-01/819-2634/6n4tl5km3/index.html#abxbm
	
    protected void controllerDispatchPageXML() throws ServletException, IOException{
        response.setContentType(xmlHeader);
        (getServletConfig().getServletContext().getRequestDispatcher("/resultList.jsp")).include(request, response);
    }
	
	
	
	
	