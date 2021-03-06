package inventoryAllocator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class Test10 {
	//invalid inventory for multiple orders
	@Test
	void testInventoryAllocator() {
		// items ordered
		HashMap<String, Integer> orderedItems = new HashMap<String, Integer>();
		orderedItems.put("Apple", 5);
		orderedItems.put("Banana", 2);

		// inventory available
		ArrayList<Warehouse> inventoryList = new ArrayList<Warehouse>();
		HashMap<String, Integer> inventoryItems = new HashMap<String, Integer>();
		inventoryItems.put("Apple", 4);
		Warehouse nj = new Warehouse("nj", inventoryItems);
		inventoryList.add(nj);

		HashMap<String, Integer> inventoryItems2 = new HashMap<String, Integer>();
		inventoryItems2.put("Banana", 1);
		Warehouse az = new Warehouse("az", inventoryItems2);
		inventoryList.add(az);

		HashMap<String, Integer> inventoryItems3 = new HashMap<String, Integer>();
		inventoryItems3.put("Apple", 2);
		Warehouse fl = new Warehouse("fl", inventoryItems3);
		inventoryList.add(fl);

		// actual result
		ArrayList<ResultObject> result = InventoryAllocator.inventoryAllocator(orderedItems, inventoryList);

		// expected result
		ArrayList<ResultObject> answer = new ArrayList<ResultObject>();
		

		assertEquals(answer.toString(), result.toString());
	}

}
