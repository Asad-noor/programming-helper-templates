fun String.isAllUnique(): Boolean = all(hashSetOf<Char>()::add) //true if the string has no double characters 

val str = "abmdef"
str.all { it.isLetterOrDigit() } //true if the string has only alphanumeric characters

str.toCharArray().sorted().reversed() //sort it alphabetically then reverse
println(intList.sorted()) //sorted where at the end "ed" it means it will not change the original list, will create a new one

val str = "abcabc"
val charsMap = mutableMapOf<Char, Int>()
str.forEach{
    charsMap[it] = charsMap.getOrDefault(it, 0) + 1
}
print(charsMap) //{a=2, b=2, c=2}


class University(private val repository: Repository<Student>) {
    fun getPaidCoursesWithTheNumbersOfSubscribedStudents(coursesCount: Int): Map<Course, Int> {
        val studentList = repository.get()
        //print(studentList.size())
        val result: MutableMap<Course, Int> =  mutableMapOf()
        for(student in studentList) {
            val courses = student?.subscribedCourses
            for(course in courses) {
                if (course.isPaid) {
                    result[course] = result.getOrDefault(course, 0) + 1
                }
            }
        }
        result.entries.sortedWith(compareByDescending { s -> s.value})
        return result
    }         
}

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor(val tokenStorage: TokenStorage): Interceptor {
  override fun intercept(chain: Interceptor.Chain): Response {
      var request = chain.request()
      if (tokenStorage.retrieveToken()?.isNullOrBlank() == false) {
          request = request.newBuilder().header("Authorization", "Bearer ".plus(tokenStorage.retrieveToken())).build()
      }
      return chain.proceed(request)
  }
}
