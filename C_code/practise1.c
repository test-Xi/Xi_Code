#include <stdio.h>
float WR(float r,float h)
{
    float PI=3.1415;
    float size = PI*r*r*h;
    return size;
}
int main()
{
    printf("请输入圆柱体的半径和高：\n");
    float r,h;
    scanf("%f%f",&r,&h);
    float size = WR(r,h);
    printf("圆柱体的体积是%0.2f\n",size);
    return 0;
}
