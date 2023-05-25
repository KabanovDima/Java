# Создать телефонный справочник с возможностью импорта и экспорта данных в формате .txt. Фамилия, имя, отчество, номер телефона - данные, которые должны находиться в файле.

# Программа должна выводить данные
# Программа должна сохранять данные в текстовом файле
# Пользователь может ввести одну из характеристик для поиска определенной записи(Например имя или фамилию человека)
# Использование функций. Ваша программа не должна быть линейной

def printData():
    with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_HW/data.txt', 'r', encoding='utf-8') as file:
        text = file.read()
        print(text)

def enterData():
    with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_HW/data.txt', 'a', encoding='utf-8') as file:
        some_list = []
        some_lines = str(input('Введите фамилия: '))
        some_lines1 = str(input('Введите имя: '))
        some_lines2 = str(input('Введите отчество: '))
        some_lines3 = str(input('Введите номер телефона: '))
        some_list.append(some_lines)
        some_list.append(some_lines1)
        some_list.append(some_lines2)
        some_list.append(some_lines3)
        for el in some_list:
            file.write(el + ' ')
        file.write('\n')

def searchData():
    with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_HW/data.txt', 'r', encoding='utf-8') as file:
        text = file.read().split('\n')
        print(text)
        
        wordSerch = str(input('Введите параметр для поиска(имя, фамилия, отчество или номер телефона): '))
        for i in text:
            textSplit = i.split(' ')
            for j in textSplit:
                if wordSerch == j:
                    print(i)

while True:
    actions = str(input('Введите действие (e - ввод записи, s - поиск записи, p - распечатаь список): '))
    if actions == 'e':
        enterData()
    elif actions == 's':
        searchData()
    elif actions == 'p':
        printData()
    else:
        print('Вы ввели несуществующее действие. Попробуйте еще раз.')
