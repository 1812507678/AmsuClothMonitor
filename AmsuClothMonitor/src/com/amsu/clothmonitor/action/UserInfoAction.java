package com.amsu.clothmonitor.action;

import com.opensymphony.xwork2.Action;

public class UserInfoAction implements Action{
	private String useronLineJson;  
	
	@Override
	public String execute() throws Exception {
		System.out.println("execute");
		useronLineJson = "{\n" +
                "\t\t\t\t\t    page: \"1\",\n" +
                "\t\t\t\t\t    records: \"3\",\n" +
                "\t\t\t\t\t    data: [{\n" +
                "\t\t\t\t\t        url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content1\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/2.jpg\",\n" +
                "\t\t\t\t\t        content: \"content2\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/3.jpg\",\n" +
                "\t\t\t\t\t        content: \"content3\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content4\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },{\n" +
                "\t\t\t\t\t         url: \"images/1.jpg\",\n" +
                "\t\t\t\t\t        content: \"content5\"\n" +
                "\t\t\t\t\t    },]\n" +
                "\t\t\t\t\t}";  
		
		return SUCCESS;
	}

	public String getMessage() {  
        return useronLineJson;  
    }  
	
}
