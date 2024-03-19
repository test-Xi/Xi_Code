#include <stdio.h>

int main() {
    float angle;

    printf("请输入线的角度：");
    scanf("%f", &angle);

    if (angle == 0) {
        printf("0 度的角度位于正 X 轴上。\n");
    } else if (angle == 90) {
        printf("90 度的角度位于正 Y 轴上。\n");
    } else if (angle == 180) {
        printf("180 度的角度位于负 X 轴上。\n");
    } else if (angle == 270) {
        printf("270 度的角度位于负 Y 轴上。\n");
    } else if (angle > 0 && angle < 90) {
        printf("该线位于第一象限。\n");
    } else if (angle > 90 && angle < 180) {
        printf("该线位于第二象限。\n");
    } else if (angle > 180 && angle < 270) {
        printf("该线位于第三象限。\n");
    } else if (angle > 270 && angle < 360) {
        printf("该线位于第四象限。\n");
    } else {
        printf("无效的角度输入。\n");
    }

    return 0;
}
