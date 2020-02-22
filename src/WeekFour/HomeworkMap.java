package WeekFour;
import java.util.HashMap;
import java.util.Map;
class HomeworkMap {
  /*
    Maps:
  * Write a Java program to test if a map contains a mapping for the specified key.
  * Write a Java program to copy all of the mappings from the specified map to another map.
  * Remove a value from HashMap based on key
  */
  public static void main(String[] args) {
    System.out.println("#1");
    mapKey(); //#1
    System.out.println("\n#2");
    copyMap(); //#2
    System.out.println("\n#3");
    removeValue(); //#3
  }
  public static void mapKey(){
    Map<Integer, String> userList = new HashMap<>();
    user_list.put(1,"Lim" );
    user_list.put(2,"Test Pro" );
    user_list.put(3,"QA Engineer" );
    user_list.put(4,"Student" );
    // displaying the HashMap
    System.out.println("Initial Mappings are: " + userList);
    // displaying the keys and sets
    System.out.println("Key: " + userList.keySet());
    System.out.println("value: " + userList.values());
    // displaying specified key value
    System.out.println("The Key # 1: " + userList.get(1) );
    // displays true or false if the key exist
    System.out.println("Is the first Key exist? : " + userList.containsKey(1));
    //displays true or false if the value does exist
    System.out.println("Is the first value of the key exist? : " + userList.containsValue("Lim"));
  }
  public static void copyMap(){
    Map<String, Integer> age1 = new HashMap<>();
    Map<String, Integer> age2 = new HashMap<>();
    age1.put("Chris", 33);
    age1.put("Marianne", 35);
    age1.put("Test Pro", 5);
    System.out.println("First Map Age: " + age1);
    age2.putAll(age1);
    System.out.println("Second Map Age: " + age2);
  }
  public static void removeValue(){
    Map<Integer, Boolean> removeVal = new HashMap<>();
    removeVal.put(1, true);
    removeVal.put(2, false);
    removeVal.put(3, true);
    removeVal.put(4, true);
    System.out.println("Display Current Hash: " + removeVal);
    removeVal.remove(2);
    System.out.println("Display Hash after remove method: " +removeVal);
  }
}
