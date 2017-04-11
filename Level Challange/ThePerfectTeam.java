/*
The Perfect Team
*/
static int differentTeams(String skills) {
        int count = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('p',0);
        map.put('c',0);
        map.put('m',0);
        map.put('b',0);
        map.put('z',0);
       
        for(int i=0; i<skills.length(); i++) {
            char ch = skills.charAt(i);
            map.put(ch, (map.get(ch)+1));                       
        }
       
       int minValue = Integer.MAX_VALUE;
        for (Character key : map.keySet()) {
            int value = map.get(key);
            if (value < minValue) {
                minValue = value;
            }
       }
       return minValue;
    }
