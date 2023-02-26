Финальный проект курса SkillFactory JAVA-разарботчик.
В данном проект реализован Rest API.

Операция getBalance.
Метод GET. Требуется передача целочисленного идентификатора пользователя в виде параметра id.
Возвращает текущий баланс пользователя или -1 и описание в случае ошибки.
Пример запроса http://localhost:8080/api/getBalance?id=1

Операция takeMoney.
Метод POST. Требуется передача целочисленного идентификатора пользователя в виде параметра id и количества денег,
которое необходимо списать с баланса пользователя, в виде параметра money, числа с двумя десятичными знаками после точки.
Возвращает 1 в случае успешного выполнения запроса или 0 и описание в случае ошибки.
Пример запроса http://localhost:8080/api/takeMoney?id=1&money=123546

Операция takeMoney.
Метод POST. Требуется передача целочисленного идентификатора пользователя в виде параметра id и количества денег,
которое необходимо зачислить на баланс пользователя, в виде параметра money, числа с двумя десятичными знаками после точки.
Возвращает 1 в случае успешного выполнения запроса или 0 и описание в случае ошибки.
Пример запроса http://localhost:8080/api/putMoney?id=1&money=123546