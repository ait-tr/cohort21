**Linux** - операционная система для серверов

### Зачем нужны RSA-ключи?

- обеспечивает проверку пользователя (аутентификацию) без пароля
- создаются благодарю ассиметричному алгоритму шифрования `RSA`
- всего два ключ
    - публичный (public)
    - приватный (private)
- посмотреть публичный ключ
    - `cat ~/.ssh/id_rsa.pub`
    

### Основные подсистемы (части) любого проекта

- `BE`
- `FE`
    - веб-сайты
    - приложения
    - `API`
- `DB/DBMS`
- `Deployment` (напр., GitHub Pages)

### Что такое SSH (Secure SHell)?

- протокол удаленного доступа к серверу (для управления сервером)

### Основные (базовые) команды LINUX

(вводятся в `CLI`)

`cd` сменить каталог

`cd каталог` перейти в каталог

`cd` перейти дом/каталог пользователя

`pwd` посмотреть текущий каталог

`ls` просмотр содержимого каталога

`cat /etc/os-release` просмотр сведений об ОС

`ping удаленный_сервер` проверка времени отклика удаленного сетевого узла

`uptime` время непрерывной работы сервера

`rm имя_файла` удалить файл

`rm -rf каталог` удалить каталог

`mkdir` новый_каталог создать новый_каталог

`touch имя_файла` создать пустой файл

`ls -lah` подробный вывод содержимого

`-l` listing

`-a` all

`-h` human-readable

`cat имя_файла` вывести содержимое файла на экран

`df -h > имя_файла.txt` запись результата `df -h` в файл

`>` перезапись

`>>` дозапись

### Текстовые редакторы

`nano` примитивный

`nano имя_файла` открыть файл на редактирование

`vim` продвинутый

`wget` скачать файл из Интернет

`wget -O название_файла_куда_сохранить URL`

`less название_файла` просмотр текстового файла (”листалка”)

`q` - выйти

`/` - поиск

### Компрессия (сжатие) файлов

- компрессия часто связана с резеревным копированием (**backup**)
- `gzip` сжатие файлов
    - `gzip -9 название_файла` сжать файл с MAX-компрессией

`gunzip название_файла` расжать файл

`man` просмотр документации

`man gzip`

### Контрольные суммы (хеширование)

`SHA` - алгоритм хеширования

`sha1sum название_файла`

### Git

- прикладное ПО

**репозиторий** - файловая БД для ведения учета изменений по проекту (`.git/`)

`git init` создание нового пустого репо (`.git/`)

**GitFlow**

1. `master` - long-term
2. `develop` - long-term
3. `login/payments` - short-term

`git show` - просмотр сведений о коммите

`git show commit_id` 

`git show commit_id:название_файла`

`git branch` вывести список веток

`git branch -v` подробныq вывод

`git checkout -b название_ветки` создать ветку и переключиться на нее

`git checkout название_ветки` переключиться на ветку

### Слияние веток в Git

- позволяет перенести изменения из одной ветки в другую
- необходимо находиться в целевой ветки
- `git diff master develop` посмотреть отличия между ветками

`git diff` просмотр разницы между рабочем каталогом и индексом

`git diff --staged (--cached)` просмотр разницы между индексом и посл/коммитом

### Сохранение незакомиченных изменений

`git stash` сделать “заначку”

`git stash pop` применить посл/заначку

`git stash list` посмотреть список заначек

`git stash save 'комментарий'` сделать заначку со своим комментарием

`git stash clear` удалить все заначки

`git stash drop <stash_id>` удалить конкретную заначку по stash_id

`git checkout -f` переключить раб/каталог на состояние по посл/коммита (КОМАНДА ЯВЛ. ДЕСТРУКТИВНОЙ)

`git commit -am ‘комментарий’`

`-a` проиндексировать изменения в отслеж. файлах

`git revert commit_id` безопасное восстановление коммита (**ОТМЕНА КОММИТА**)

### Модели совместной разработки в Git

1. С доступом к репо на запись
2. Запросы слияния (**Pull requests**) - способ предложить изменения
    
    2.1. создать форк (копия) репо (через веб-интерфейс **GitHub**)
    
    2.2. склонировать репо на компьютер (`git clone`)
    
    2.3. создать новую ветку и внести предлагаемые измения (`readme-file`)
    
    2.4. закоммитить и выгрузить обратно на свой **GitHub**
    
    2.5. оформить запрос на слияния на **GitHub** (через веб-интерфейс)
    

### Облачные вычисления

**Облачные вычисления** - практика использования удаленных серверов, которые обслуживаются (поддерживаются) другой компании.

По сути, это способ взять вычислительные ресурсы в аренду.

**Преимущества**

- снижение затрат на оборудование
- гибкость настройки (масштабирования)
- очень высокая доступность (`SLA`)

**Недостатки**

- безопасность
- относительная сложность настройки

**Виды облаков**

- Общедоступные
- Частные