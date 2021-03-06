package inventoryAllocator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class Test4 {

	// Checks when 1 item is ordered but 2 warehouses are needed
	@Test
	void testInventoryAllocator() {
		// items ordered
		HashMap<String, Integer> orderedItems = new HashMap<String, Integer>();
		orderedItems.put("Apple", 5);

		// inventory available
		ArrayList<Warehouse> inventoryList = new ArrayList<Warehouse>();
		HashMap<String, Integer> inventoryItems = new HashMap<String, Integer>();
		inventoryItems.put("Apple", 4);
		Warehouse nj = new Warehouse("nj", inventoryItems);
		inventoryList.add(nj);
		
		ArrayList<Warehouse> inventoryList2 = new ArrayList<Warehouse>();
		HashMap<String, Integer> inventoryItems2 = new HashMap<String, Integer>();
		inventoryItems2.put("Apple", 2);
		Warehouse az = new Warehouse("az", inventoryItems2);
		inventoryList.add(az);

		// actual result
		ArrayList<ResultObject> result = InventoryAllocator.inventoryAllocator(orderedItems, inventoryList);

		// expected result
		ArrayList<ResultObject> answer = new ArrayList<ResultObject>();
		HashMap<String, Integer> answerMap = new HashMap<String, Integer>();
		answerMap.put("Apple", 4);
		ResultObject temp = new ResultObject("nj", answerMap);
		answer.add(temp);
		
		
		HashMap<String, Integer> answerMap2 = new HashMap<String, Integer>();
		answerMap2.put("Apple", 1);
		ResultObject temp2 = new ResultObject("az", answerMap2);
		answer.add(temp2);
		
		assertEquals(answer.toString(), result.toString());
	}

}
