package mod_13;

/*

Програма повинна містити методи для реалізації наступного функціоналу:

  +  створення нового об'єкта в https://jsonplaceholder.typicode.com/users. Можливо, ви не побачите одразу змін на сайті. Метод працює правильно, якщо у відповідь на JSON з об'єктом повернувся такий самий JSON, але зі значенням id більшим на 1, ніж найбільший id на сайті.

 +   оновлення об'єкту в https://jsonplaceholder.typicode.com/users. Можливо, ви не побачите одразу змін на сайті. Вважаємо, що метод працює правильно, якщо у відповідь ви отримаєте оновлений JSON (він повинен бути таким самим, що ви відправили).

 +   видалення об'єкта з https://jsonplaceholder.typicode.com/users. Тут будемо вважати коректним результат - статус відповіді з групи 2xx (наприклад, 200).

 +   отримання інформації про всіх користувачів https://jsonplaceholder.typicode.com/users

 +   отримання інформації про користувача за id https://jsonplaceholder.typicode.com/users/{id}

 +   отримання інформації про користувача за username - https://jsonplaceholder.typicode.com/users?username={username}

Завдання 2

Доповніть програму методом, що буде виводити всі коментарі до останнього поста певного користувача і записувати їх у файл.

https://jsonplaceholder.typicode.com/users/1/posts Останнім вважаємо пост з найбільшим id.

https://jsonplaceholder.typicode.com/posts/10/comments

Файл повинен називатись user-X-post-Y-comments.json, де Х - id користувача, Y - номер посту.
Завдання 3

 Доповніть програму методом, що буде виводити всі відкриті задачі для користувача з ідентифікатором X.

https://jsonplaceholder.typicode.com/users/1/todos.

Відкритими вважаються всі задачі, у яких completed = false.

*/



import java.io.IOException;
import java.net.URISyntaxException;

public class Demo {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

	//	CreateUser createUser = new CreateUser();
	//	createUser.createDataUser();
	//	createUser.userUpdate(2);


	//	CheckAllUserData checkAllUserData = new CheckAllUserData();
	//	checkAllUserData.checkAllUserData();

	 	CheckUserData checkUserData = new CheckUserData();
	//	checkUserData.checkUserDataFromUserName("Delphine");
	//	checkUserData.checkUserDataFromId(2);
		checkUserData.checkUserTaskFromUserId(2);
	//	checkUserData.checkUserPostFromUserId(2);


	//	DeleteUser deleteUser = new DeleteUser();
	//	deleteUser.deleteUser(3);

	}

}
