package com.util;

import java.util.List;

import com.po.Employee;

public class PageUtil {
	int pageNum =5;//每页显示条数
	List<Employee> list;//总的list
	int page;//页号
	
	public PageUtil() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageUtil(List<Employee> list, int page) {
		super();
		this.list = list;
		this.page = page;
	}
	public List<Employee> pageUtil(){
		List<Employee> myList=null;
		int pageCount = list.size()/pageNum;//一共能分的页数
		if(list.size() % pageNum != 0){
    	    pageCount = pageCount + 1;
    	}
		
	    int pages = page;//页号
  	    int startNum = (pages - 1) * pageNum;//起始号
  	    int endNum= startNum + pageNum;//结尾号
  	    if(endNum > list.size()){//如果结尾号大于列表长度 结尾号等于列表长度 
  		    endNum =list.size();
  	    }
  	    
  	    
  	    for(int i = startNum;i < endNum;i++){
  		    myList.add(list.get(i));
  	    }	
  	 return myList;
	}
	public int getPageCount(){
		int pageCount = list.size()/pageNum;//一共能分的页数
  	    if(list.size() % pageNum != 0){
    	    pageCount = pageCount + 1;
    	}
		return pageCount;
	}

}
