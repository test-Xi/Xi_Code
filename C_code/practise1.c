#include <stdio.h>
float WR(float r,float h)
{
    float PI=3.1415;
    float size = PI*r*r*h;
    return size;
}
int main()
{
    printf("������Բ����İ뾶�͸ߣ�\n");
    float r,h;
    scanf("%f%f",&r,&h);
    float size = WR(r,h);
    printf("Բ����������%0.2f\n",size);
    return 0;
}
