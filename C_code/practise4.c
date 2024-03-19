#include <stdio.h>
int main()
{
    printf("Please enter the year and the weight of an automobile\n ");
    int year,weight;
    scanf("%d %d",&year,&weight);
    if(year<=1970){
        if(weight<2700){
            printf("The weight class is 1,and the fee is 16.50$\n");
        }else if(weight>=2700&&weight<=3800){
            printf("The weight class is 2,and the fee is 25.50$\n");
        }else{
            printf("The weight class is 3,and the fee is 46.50$\n");
        }
    }else if(year>=1971&&year<=1979){
        if(weight<2700){
            printf("The weight class is 4,and the fee is 27.00$\n");
        }else if(weight>=2700&&weight<=3800){
            printf("The weight class is 5,and the fee is 30.50$\n");
        }else{
            printf("The weight class is 6,and the fee is 52.50$\n");
        }
    }else{
         if(weight<=3500){
            printf("The weight class is 7,and the fee is 35.50$\n");
        }else{
            printf("The weight class is 8,and the fee is 65.50$\n");
        }
    }
    return 0;
}
