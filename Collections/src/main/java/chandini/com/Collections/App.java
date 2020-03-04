package chandini.com.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger();
    public static void main( String[] args ){
    	CustomList<Integer> customList = new CustomList<Integer>();
    	customList.add(10);
    	customList.add(20);
    	customList.add(30);
    	customList.add(40);
    	customList.add(50);
    	customList.add(60);
    	LOGGER.info("Size of the List: "+customList.size());
    	LOGGER.info("Initial List :"+customList);
    	LOGGER.info("Element at Index 3:" + customList.get(3));
    	customList.remove(3);
    	LOGGER.info("After deleting element at index 3: "+ customList);
    	LOGGER.info("Size of the List after removing element at index 3: "+customList.size());
    	
    }
}
