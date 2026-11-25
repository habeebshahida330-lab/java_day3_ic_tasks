import java.util.HashMap;
class HashMapExample{
    public static void main(String[] args) {
       HashMap<String,String> students = new HashMap<>();//HashMap
         students.put("1","John");//adding elements into the hashmap
          students.put("2","Alice");
          students.put("3","Bob");
          System.out.println(students);//printing elements from the hashmap
          System.out.println("Student 1: " + students.get("1"));
          students.put("2", "delce");//printing elements from the hashmap at particular key
          students.remove("1");//removing elements from the hashmap at particular key
          System.out.println("updated Map: " + students);
    }
}