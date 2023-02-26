<h3>Финальный проект курса SkillFactory JAVA-разарботчик.</h3>
<p>В данном проект реализован Rest API.</p>
<h4>Операция getBalance.</h4>
<p>Метод GET. Требуется передача целочисленного идентификатора пользователя в виде параметра id.
Возвращает текущий баланс пользователя или <b>-1</b> и описание в случае ошибки.
Пример запроса <i>http://localhost:8080/api/getBalance?id=1</i></p>
<h4>Операция takeMoney.</h4>
<p>Метод POST. Требуется передача целочисленного идентификатора пользователя в виде параметра id и количества денег,
которое необходимо списать с баланса пользователя, в виде параметра money, числа с двумя десятичными знаками после точки.
Возвращает <b>1</b> в случае успешного выполнения запроса или <b>0</b> и описание в случае ошибки.
Пример запроса <i>http://localhost:8080/api/takeMoney</i></p>
<h4>Операция takeMoney.</h4>
<p>Метод POST. Требуется передача целочисленного идентификатора пользователя в виде параметра id и количества денег,
которое необходимо зачислить на баланс пользователя, в виде параметра money, числа с двумя десятичными знаками после точки.
Возвращает <b>1</b> в случае успешного выполнения запроса или <b>0</b> и описание в случае ошибки.
Пример запроса <i>http://localhost:8080/api/putMoney</i></p>
<h4>Структура базы данных:</h4>
<img src="https://github.com/adapterig/SkillFactoryFproject/blob/master/db.PNG?raw=true">