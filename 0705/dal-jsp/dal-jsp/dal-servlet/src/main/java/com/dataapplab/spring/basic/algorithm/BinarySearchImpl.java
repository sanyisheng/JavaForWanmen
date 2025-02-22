package com.dataapplab.spring.basic.algorithm;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
    /*public void init() {
		System.out.println("init method");
    }
    
	@PostConstruct
	public void postConstruct(){
		logger.info("post constructor");
	}    
	
	@PreDestory
	public void preDestory(){
		logger.info("pre destory");	
	}
    */

	
	
	//@Qualifier("bubble")  //by qualifier
	//private SortAlgorithm sortAlgorithm;
	private SortAlgorithm bubbleSortAlgorithm; //autowired by name, if other name

	@Autowired
    public BinarySearchImpl(SortAlgorithm bubbleSortAlgorithm) {
		this.bubbleSortAlgorithm = bubbleSortAlgorithm;
	}
	public SortAlgorithm getBubbleSortAlgorithm() {
		return bubbleSortAlgorithm;
	}

    public void setBubbleSortAlgorithm(SortAlgorithm bubbleSortAlgorithm) {
		this.bubbleSortAlgorithm = bubbleSortAlgorithm;
	}
	
	
	
    /*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.bubbleSortAlgorithm = sortAlgorithm;
	}
	*/

    
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		//BubbleSortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = this.bubbleSortAlgorithm.sort(numbers);
		
		//System.out.println(bubbleSortAlgorithm);
		
		// Search the array
		return 3;
	}
}