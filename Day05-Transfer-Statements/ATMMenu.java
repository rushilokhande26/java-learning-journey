class ATMMenu {
    public static void main(String[] args) {

        int option = 2;  // Change this value to test different cases

        switch(option) {

            case 1:
                System.out.println("Check Balance Selected");
                break;

            case 2:
                System.out.println("Withdraw Money Selected");
                break;

            case 3:
                System.out.println("Deposit Money Selected");
                break;

            case 4:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid Option");
        }
    }
}



//=======SYNTAX========

// switch(expression){
//     case value1:
//         // code block
//         break;

//     case value2:
//         // code block
//         break;

//     default:
//         // default code

// }