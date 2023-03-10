import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 4, 5, 5, 6, 7));
        // task1(nums);
        // task2(nums);
        String text = "With that said, most Americans, instead of honoring" +
                " St. Valentine through religious ceremony, enjoy the holiday by " +
                "engaging in \"romantic\" behavior with their significant other or" +
                " someone who they wish to be their significant other; gifts, special dinners," +
                " and other acknowledgements of affection comprise most individuals' Valentine's Day celebrations.";
        text = text.replaceAll("!,.", "");
        List<String> textList = new ArrayList<>(List.of(text.split(" ")));
        List<String> strings = new ArrayList<>(List.of("welcome", "no", "hell"));
        List<String> strings1 = new ArrayList<>(List.of("welcome", "no", "hell"));
      //  task3(strings);
        task4(textList);
    }

    private static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (!isEven(num)) {
                System.out.println(num);
            }

        }
    }

    private static void task2(List<Integer> nums) {
        Collections.sort(nums);
        Set<Integer> numSet = new HashSet<>(nums);


        for (Integer num : numSet) {
            if (isEven(num)) {
                System.out.println(num);
            }

        }

    }
    private static boolean isEven(Integer num) {
        return num % 2 == 0;
    }
    private static void task3(List<String> strings) {
        System.out.println(new HashSet<>(strings));
    }
     private static void task4(List<String> strings){
        Map<String, Integer> countStringByString = new HashMap<>();
        for(String str: strings){
          if(countStringByString.get(str) == null) {
              countStringByString.put(str, 1);
              System.out.println(countStringByString);
          } else {
              countStringByString.put(str,countStringByString.get(str)+1);
              System.out.println(countStringByString);
          }
        }
        for (Map.Entry<String, Integer > entry :countStringByString.entrySet()){
            if (entry.getValue()>1) {
                System.out.println(entry);
            }
         }
         System.out.println(countStringByString);

     }
}


