### Программные интфейсы

- `GUI` - графический (более простой)
- `CLI` - командный (более продвинутый)

### Что такое сервер?

1. Высокопроизводительный компьютер
2. Пассивная роль в клиент-серверной арх.
3. Также сервер - это программа (напр., СУБД)

### Что такое Linux и зачем он нужен?

- Класс ОС на основе ядра Linux
- Самая распространенная ОС для серверов

### Основные подсистемы проектов

- `Frontend` (интерфейс)
- `Backend` (бизнес-логика)
- `DB` (хранилище)
- `Deployment` (развертывание)

### Что такое проект?

- Кодовая база
- Каталог с файлами/подкаталогами проекта

### Что такое Git и зачем он нужен?

- система контроля версий
- хранилище (БД) истории разработки
- вспомогательный инструмент любого разработчика

**GIT** - приложение/программа (прикладное)

**GitHub** - интернет-площадка (хостинг проектов)

**GitHub Pages** - сервис GitHub (хостинг сайтов)

### Зачем нужна пара `RSA`-ключей?

- Для беспарольной аутентификации (напр., GitHub, серверах при подкл. по SSH)
- Представляют собой текстовые файлы
- Два ключевых файла
    - публичный (public)
    - приватный (private)

### Что такое коммит?

- выполняется командной `git commit` (как правило, с различными опциями)
    - `git commit -m 'комментарий'`
- это - фиксация (сохранение) изменений

**Что делает команда `git init`?**

- Создает пустой репо - каталог `.git/`

**Что делает команда `git add`**?

- Добавляет изменения в индекс (буфер, очередь на коммит)
- `git add .` (точка - тек/каталог)
- `git add dir1/dir2/1.html`

**Что делает команда `git remote`?**

- Выполняет привязку LOCAL ↔ REMOTE (один  раз для нового проекта)

### Дополнительные команды в GIT

`git log` просмотр журнала коммитов

`git status` просмотр состояния раб/каталога

`git status -s` short

`git reset` очистить индекс

`git reset filename` удалить файл из индекса

`git remote -v` просмотр текущих привязок

`git remote rm origin` удалить привязоку origin

`git remote show origin` диагностика привязка

`git diff` просмотр разницы (отличий)

`git diff` просмотр разницы между раб/каталогом и индексом

`git show` просмотр коммитов

`git show` просмотр последнего коммита

`git show <commit_id>` просмотр коммита <commit_id>

### Легенеда `git status -s`

`??` - Untracked (неотслеж.)

`M` - Modified (модифиц.)

`A` - Added (новые, добавленные)

`D` - Deleted (удаленные)

Зеленый - файл в индексе

Красный - не в индексе

### Состояния файлов с точки зрения GIT

- неотслеживаются (через `git rm`)
- отслеживаемые (через `git add`)
- игнорируемые (через `.gitignore`)

### Ветвление в GIT

**Ветвь** - изолированный поток разработки (еще одна версия проекта)

`git branch` просмотр веток

`git branch <новая_ветка>` создать новую ветку

`git branch -m новое_название` переименовать текущую локальную ветку

`git branch -D название_ветки` удалить локальную ветку

`git checkout <ветка>` переключиться на ветку

`git checkout <commit_id>` переключиться на коммит

`git checkout -b <новая_ветка>` создать новую ветку и переключиться на нее

`git push origin --delete название_ветки` удалить дистанционную ветку (на GitHub)

### Стратегии ветвления

1. **Git Flow**
    1. `master/main/stable/production` - long-term branch
    2. `develop/current` - long-term branch
    3. `ticket01/payments/login` - short-term branch

1. **GitHub Flow**
    1. `master`
    2. short-term branches

### Стратегия выполнения коммитов

1. “По окончании раб/дня” - не рекомендется
2. Слишком частые коммиты - не рекомендуется
3. **Фиксация небольших логических задач** - рекомендуется

*COMMIT EARLY. COMMIT OFTEN.*

### Рекомендации к выполнению коммитов

1. Не должен содержать явно неработающий код
2. Должен относиться к небольшой логической задачи
3. Должен иметь небольшой понятный комментарий

### Вариант состовления комментария коммита

`характер_правки(модуль): короткое описание` - шаблон

`fix(payments): исправил адрес платежного шлюза` - пример

`feat(...): ...` новая функция

`style(...): ...` стили

`docs()`

`build()`

### Определение списка игнорируемых файлов/каталогов

Выполняется через файл `.gitignore`

### Удаление файлов

`git rm <filename>` удалить файл (отовсюду)

`git rm --cached <filename>` удалить файл из репо

### Вернуть каталог к состоянию последнего коммита

`git checkout -f`

### Добавление описания на GitHub

- Выполняется через файл `README.md`
- В формате `Markdown`

**Справочная информация**

[Markdown](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)

[.gitignore](https://www.atlassian.com/git/tutorials/saving-changes/gitignore)