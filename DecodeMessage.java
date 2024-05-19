class DecodeMessage {
    public String decodeMessage(String key, String message) {
        List<Character> temp = new ArrayList<>();

        for(int i=0; i<key.length(); i++){
            char ch = key.charAt(i);
            if(!temp.contains(ch) && ch != ' '){
                temp.add(ch);
            }
        }

        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        String out = "";
        for(int i=0; i<message.length(); i++){
            char ch = message.charAt(i);
            if(ch != ' '){
                int id = temp.indexOf(ch);
                out += alpha[id];
            }else{
                out += ch;
            }
            
        }
        return out;
    }
}
