#include <stdio.h>

int main() {
    float angle;

    printf("�������ߵĽǶȣ�");
    scanf("%f", &angle);

    if (angle == 0) {
        printf("0 �ȵĽǶ�λ���� X ���ϡ�\n");
    } else if (angle == 90) {
        printf("90 �ȵĽǶ�λ���� Y ���ϡ�\n");
    } else if (angle == 180) {
        printf("180 �ȵĽǶ�λ�ڸ� X ���ϡ�\n");
    } else if (angle == 270) {
        printf("270 �ȵĽǶ�λ�ڸ� Y ���ϡ�\n");
    } else if (angle > 0 && angle < 90) {
        printf("����λ�ڵ�һ���ޡ�\n");
    } else if (angle > 90 && angle < 180) {
        printf("����λ�ڵڶ����ޡ�\n");
    } else if (angle > 180 && angle < 270) {
        printf("����λ�ڵ������ޡ�\n");
    } else if (angle > 270 && angle < 360) {
        printf("����λ�ڵ������ޡ�\n");
    } else {
        printf("��Ч�ĽǶ����롣\n");
    }

    return 0;
}
