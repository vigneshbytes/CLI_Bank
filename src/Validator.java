public final class Validator {

    // Method to check NAME
    static final String nameCheck (String name) throws GenericException {
        
        if (name == null){
            throw new GenericException("cannot be null pointer");
        }
        
        if (name.length() >50 | name.isEmpty()) {
            throw new GenericException("name too long or too short");
        }

        char[] chars = name.toCharArray();
        for(char c: chars){
            if( (c <= 'Z' & c >= 'A') | (c <= 'z' & c >= 'a') | (c == ' ') ){
                continue;
            }
            else {
                throw new GenericException("invalid character in name");
            }
        }
        return name;
    }

    // Method to check AGE
    static final int ageCheck (Integer age) throws GenericException {

        if (age == null){
            throw new GenericException("cannot be null pointer");
        }

        if (age < 18) {
            throw new GenericException("age too small");
        }
        else if(age >200) {
            throw new GenericException("age unusually large");
        }
        else {
            return age;
        }
    }

    // Method to check DEPOSIT
    static final int depositCheck (Integer add) throws GenericException {

        if (add == null){
            throw new GenericException("cannot be null pointer");
        }

        if (add < 0) {
            throw new GenericException("deposit cannot be negative");
        }
        else if(add >10000) {
            throw new GenericException("deposit unusually large");
        }
        else {
            return add;
        }
    }


    // Method to check UserChoices Enum
    static final int choiceCheck (Integer choice) throws GenericException {

        if (choice == null){
            throw new GenericException("cannot be null pointer");
        }

        if (choice < 0) {
            throw new GenericException("choice cannot be negative");
        }
        else if(choice >4) {
            throw new GenericException("choice unusually large");
        }
        else {
            return choice;
        }
    }

}
