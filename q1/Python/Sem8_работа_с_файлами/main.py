# Открытие и печать файла
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/example_sem8.txt', 'r', encoding='utf-8') as file:
#     #file.seek(10) # начинаем считывать не с начала а указанного кол-ва байт
#     text = file.read(10) # в reed можно указать параметр - означает, сколько байт считать
#     print(text)

# Считывание
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/example_sem8.txt', 'r', encoding='utf-8') as file:
    # line = file.readline()
    # print(line)

# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/example_sem8.txt', 'r', encoding='utf-8') as file:
#     while True:
#         line = file.readline()
#         if not line: # или if line == ''
#             break
#         print(line[:-1]) #[:-1] - печатаем до -1 символа, иначе печатает невидимую пустую красную строку

# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/example_sem8.txt', 'r', encoding='utf-8') as file:
#     line = file.readline()
#     while line:
#         print(line[:-1])
#         line = file.readline()

# Обработка файла по строчкам
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/example_sem8.txt', 'r', encoding='utf-8') as file:
#     text = file.read()
#     print(text.splitlines()) #либо можно написать print(text.split('\n'))

# Если нужны пустые красные строки, то:
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/example_sem8.txt', 'r', encoding='utf-8') as file:
#     text = file.readlines()
#     print(text)

# Запись в файл
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/example_sem8.txt', 'w', encoding='utf-8') as file: 
# #режим a - добавление к существующим данным, режим w - перезапись всего существующего файла новыми данными
#     some_list = ['hello', 'world', 'how', 'are', 'you']
#     for el in some_list:
#         file.write(el + '\n') #добавили '\n' чтобы записалось построчно

# Запись словаря (ключь - значение). json файлы
# import json
# some_dict = {1:2, 2:3}
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/example_sem8.json', 'w', encoding='utf-8') as file: 
#     json.dump(some_dict, file)

# Запись списка в txt файл
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/example_sem8.txt', 'w', encoding='utf-8') as file: 
    # some_dict = {1:2, 2:3}
    # file.write(str(some_dict)[1:-1]) #будет напечатано: {1: 2, 2: 3}, если прописать file.write(str(some_dict)[1:-1]) то фигурные скобки не напечатаются 1: 2, 2: 3

# ====================================================================
# =================== ЗАДАЧИ =========================================
# ====================================================================

# 1. Пользователь вводит кол-во строк, затем сами строки в консоли. Нужно записать 
# в новй текстовый файл все эти строки
# 2. Далее пользователь вводит символ. Нужно найти кол-во этого символа в новом файле.

# var1
# num_lines = int(input('Введите кол-во строк, затем введите сами строки: '))
# str_list = []
# while len(str_list) <= num_lines-1:
#     str_lines = str(input())
#     str_list.append(str_lines)
# # print(*str_list, sep='\n')
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/task1_2.txt', 'w', encoding='utf-8') as file:
#     for el in str_list:
#         file.write(el + '\n')

# ent_chsr = str(input('введите символ: '))
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/task1_2.txt', 'r', encoding='utf-8') as file:
#     text = file.read()
#     print(text.count('ent_chsr'))

# Var2
# num_lines = int(input('Введите кол-во строк, затем введите сами строки: '))
# str_list = []
# for el in range(num_lines):
#     str_list.append(str(input(f'строка {el+1}: ')) + '\n')
# # print(*str_list)
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/task1_2.txt', 'w', encoding='utf-8') as file:
#     file.writelines(str_list)

# ent_chsr = str(input('введите символ: '))
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/task1_2.txt', 'r', encoding='utf-8') as file:
#     text = file.read()
#     print(text.count(ent_chsr))
    

# 3. Документ «article.txt» содержит следующий текст:
#
# Вечерело
# Жужжали мухи
# Светил фонарик
# Кипела вода в чайнике
# Венера зажглась на небе
# Деревья шумели
# Тучи разошлись
# Листва зеленела

# Требуется реализовать функцию longest_words(file), которая выводит слово,
# имеющее максимальную длину (или список слов, если таковых несколько).

# var1
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/article.txt', 'r', encoding='utf-8') as file:
#     text = file.read().split()
#     print(text)
#     len_max = 0
#     for i in text:
#         if len_max <= len(i):
#             len_max = len(i)
#     print(len_max)

#     strLenMax = []
#     for j in text:
#         if len(j) == len_max:
#             strLenMax.append(j)
#     print(*strLenMax)

# var2
# with open('C:/Users/Dmitry/Desktop/GbDeveloper/GbDeveloper/q1/Python/Sem8_работа_с_файлами/article.txt', 'r', encoding='utf-8') as file:
#     text = file.read().split()
#     print(text)
#     len_max = max(list(map(len, text)))
#     print(len_max)
#     strLenMax = list(filter(lambda x: len(x) == len_max, text))
#     print(*strLenMax)
