#include <stdio.h>
float normalWeight(float age)
{
    float nweight=0.5*(age-6)*(age-6)+5.0*(age-6)+48;
    return nweight;
}
int main()
{
    printf("������С������������أ�\n");
    float age,weight;
    scanf("%f%f",&age,&weight);
    float nweight=normalWeight(age);
    printf("С���ı�׼����Ϊ��%f\n",nweight);
    if(weight>nweight){
        printf("С������ƫ��ٷֱ�Ϊ��%0.2f\n",(weight-nweight)/weight*100);
    }else if(weight<nweight){
        printf("С������ƫ��ٷֱ�Ϊ��%0.2f\n",(nweight-weight)/weight*100);
    }
    return 0;
}
