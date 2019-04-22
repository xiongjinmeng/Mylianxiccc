#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_movie_bw_com_mylianxiccc_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "计算";
    return env->NewStringUTF(hello.c_str());
}
extern "C" JNIEXPORT jstring JNICALL
Java_movie_bw_com_mylianxiccc_MainActivity_jiaFromJNI(
        JNIEnv *env,
jobject /* this */) {
std::string hello = "+";
return env->NewStringUTF(hello.c_str());
}
extern "C" JNIEXPORT jstring JNICALL
Java_movie_bw_com_mylianxiccc_MainActivity_dengFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "=";
    return env->NewStringUTF(hello.c_str());
}extern "C"
JNIEXPORT jint JNICALL
Java_movie_bw_com_mylianxiccc_NativeHelper_calculateSum(JNIEnv *env, jclass type, jint number, jint other) {

    return number + other;

}