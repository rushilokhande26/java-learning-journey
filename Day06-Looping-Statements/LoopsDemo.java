//========= For Loop

for(int i = 1; i <= 5; i++){
    System.out.println(i);
}

//========= Nested For Loop

for(int i = 1; i <= 3; i++){
    for(int j = 1; j <= 3; j++){
        System.out.print("* ");
    }
    System.out.println();
}

//========= While Loop

int i = 1;
while(i <= 5){
    System.out.println(i);
    i++;
}

//========= Do-While Loop

int i = 1;
do{
    System.out.println(i);
    i++;
}while(i <= 5);

//========= Labelled For Loop

outer:
for(int i = 1; i <= 3; i++){
    for(int j = 1; j <= 3; j++){
        if(i == 2){
            break outer;
        }
        System.out.println(i + " " + j);
    }
}

//========= For-Each Loop

int arr[] = {10, 20, 30};

for(int num : arr){
    System.out.println(num);
}