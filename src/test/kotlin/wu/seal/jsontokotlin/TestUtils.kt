package wu.seal.jsontokotlin

import wu.seal.jsontokotlin.classscodestruct.KotlinDataClass
import wu.seal.jsontokotlin.interceptor.IKotlinDataClassInterceptor
import wu.seal.jsontokotlin.utils.classblockparse.ClassCodeParser

/**
 * Generate kotlin data classes with root name 'Test'
 */
fun String.generateKotlinDataClass(className: String = "Test") =
        KotlinDataClass.fromParsedKotlinDataClass(ClassCodeParser(KotlinCodeMaker(className, this).makeKotlinData()).getKotlinDataClass())


fun KotlinDataClass.applyInterceptor(interceptor: IKotlinDataClassInterceptor): KotlinDataClass {
    return applyInterceptors(listOf(interceptor))
}