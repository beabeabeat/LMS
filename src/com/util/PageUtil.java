package com.util;

import java.util.List;

import com.po.Employee;

public class PageUtil {
	int pageNum =5;//ÿҳ��ʾ����
	List<Employee> list;//�ܵ�list
	int page;//ҳ��
	
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
		int pageCount = list.size()/pageNum;//һ���ֵܷ�ҳ��
		if(list.size() % pageNum != 0){
    	    pageCount = pageCount + 1;
    	}
		
	    int pages = page;//ҳ��
  	    int startNum = (pages - 1) * pageNum;//��ʼ��
  	    int endNum= startNum + pageNum;//��β��
  	    if(endNum > list.size()){//�����β�Ŵ����б��� ��β�ŵ����б��� 
  		    endNum =list.size();
  	    }
  	    
  	    
  	    for(int i = startNum;i < endNum;i++){
  		    myList.add(list.get(i));
  	    }	
  	 return myList;
	}
	public int getPageCount(){
		int pageCount = list.size()/pageNum;//һ���ֵܷ�ҳ��
  	    if(list.size() % pageNum != 0){
    	    pageCount = pageCount + 1;
    	}
		return pageCount;
	}

}
