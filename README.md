# Проект по автоматизации тестирования www.wildberries.ru

### Технологии и инструменты:
<p align="center">
<img src="images/logos/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/>
<img src="images/logos/Java.svg" width="50" height="50"  alt="Java"/>
<img src="images/logos/Github.svg" width="50" height="50"  alt="Github"/>
<img src="images/logos/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/>
<img src="images/logos/Gradle.svg" width="50" height="50"  alt="Gradle"/>
<img src="images/logos/Selenide.svg" width="50" height="50"  alt="Selenide"/>
<img src="images/logos/Selenoid.svg" width="50" height="50"  alt="Selenoid"/>
<img src="images/logos/Allure_Report.svg" width="50" height="50"  alt="Allure_Report"/>
<img src="images/logos/Jenkins.svg" width="50" height="50"  alt="Jenkins"/>
</p>

### Реализованные проверки:
* Поиск товара по артикулу
* Поиск товара по наименованию
* Проверка добавнения товара в корзину
* Проверка валюты
* Проверка локации


#### Удаленный запуск тестов с параметрами:

```bash
gradle clean ui_test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DremoteDriverUrl=https://${REMOTE_DRIVER_URL}/wd/hub/
```
где:

- <code>BROWSER</code> – браузер, в котором будут выполняться тесты.
- <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты.
- <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты.
- <code>REMOTE_DRIVER_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.

### Сборка в Jenkins
<p align="center">
<img title="Jenkins Build" src="images/screens/Jenkins.png">
</p>

### Отчет в Allure report
#### Основная страница отчета
<p align="center">
<img title="Jenkins Build" src="images/screens/Allure-report.png">
</p>

#### Тест-кейсы
<p align="center">
<img title="Jenkins Build" src="images/screens/Allure-tests.png">
</p>

### Уведомления в Telegram с использованием бота
<p align="center">
<img title="Jenkins Build" src="images/screens/tg.png">
</p>
