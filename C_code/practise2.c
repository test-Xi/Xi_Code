#include <stdio.h>
float normalWeight(float age)
{
    float nweight=0.5*(age-6)*(age-6)+5.0*(age-6)+48;
    return nweight;
}
int main()
{
    printf("请输入小孩的年龄和体重：\n");
    float age,weight;
    scanf("%f%f",&age,&weight);
    float nweight=normalWeight(age);
    printf("小孩的标准体重为：%f\n",nweight);
    if(weight>nweight){
        printf("小孩体重偏差百分比为：%0.2f\n",(weight-nweight)/weight*100);
    }else if(weight<nweight){
        printf("小孩体重偏差百分比为：%0.2f\n",(nweight-weight)/weight*100);
    }
    return 0;
}
