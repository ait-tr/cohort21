## Базовые компоненты любого проекта

- `FE` интерфейс
- `BE` бизнес-логика
- `DB` хранилище
- `Deployment` развертывание (напр., с помощью **Docker**)

![DockerArchitecture_1.webp](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9ba45d82-26c9-4abd-8c8a-c1721beef2fb/DockerArchitecture_1.webp)

## Установка Docker

[Get Docker](https://docs.docker.com/get-docker/)

## Регистрация на Docker Hub

[Docker Hub Container Image Library | App Containerization](https://hub.docker.com/)

## Что такое Docker

- прикладное ПО  (приложение) - появилось в 2013
- представляет собой платформу для контейнеризации приложений

## Основные термины

- **Образ (image)** - выполняемый пакет, который включает все необходимое для запуска приложения, ключая код приложения, среду выполнения и зависимости
- **Контейнер (container)** - экземпляр образа (процесс), который выполняется в изолированной среде
    - обеспечивает уровень изоляции от других приложений и основной системы
- **`Dockerfile`** - текстовый файл, содержащий инструкции для построения **Docker-образа**
    - определяет код и зависимости (состав), которые должны быть включены в образ
- **Docker Hub** - самый распространенный реестр образов
    - позволяет делиться собственными образами и хранит базовые (стандартные) образы
- **Docker CLI** - командный интерфейс работы с Docker
- **Docker Desktop** - GUI-интерфейс работы с Docker

## Основные команды

- `docker login` авторизация на **Docker Hub**
- `docker version` просмотр версии
- `docker run hello-world` запуск тестового контейнера на основе стандартного образа
    - `docker run -p host_port:container_port image_name`
- `docker pull название_образа` скачать образ с Docker Hub
- `docker run -it ubuntu bash` запуск оболочки bash в режиме песочницы
- `docker images` просмотр имеющихся образов
- `docker rmi -f image_id` удалить образ
- `docker build -t flask-app .` создать (созбрать) образ
- `docker ps` просмотр запущенных контейнеров
- `docker tag flask-app docker_hub_username/flask-app` привязка к репо на **Docker Hub**
- `docker push docker_hub_username/flask-app:latest` выгрузить на **Docker Hub**

## Базовый порядок с Docker

1. Открыть имеющийся проект (или создать новый)
2. Создать `Dockerfile`
3. Создать образ (на основе `Dockerfile`)
4. Запустать контейнер на основе образа

## Тестовый проект #1 (на Python)

```python
## файл app.py

from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello():
    return 'Hello, ANDREI!'

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0')
```

```docker
## Dockerfile

# Указываем базовый образ
FROM python:3.8-slim

# Устанавливаем зависимости
RUN pip install --no-cache-dir flask

# Копируем файлы в рабочую директорию контейнера
COPY . /app
WORKDIR /app

# Указываем команду, которая будет выполняться при запуске контейнера
CMD ["python", "app.py"]
```

## Тестовый проект #2 (на Java)

`git clone https://github.com/spring-projects/spring-petclinic.git`

```docker
## Dockerfile

FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
```

**Запуск проекта #2**

`docker run -p 8080:8080 clinic` запуск проекта (название `clinic` необх. изменить на свое)

## Справочная документация

- [Что такое **Docker**](https://ru.wikipedia.org/wiki/Docker)
- [базовые команды **Docker**](https://www.edureka.co/blog/docker-commands/)
- [SemVer](https://semver.org/lang/ru/)