def reverse_string(s):
    if len(s) == 0:
        return ""
    else:
        return reverse_string(s[1:]) + s[0]

def reverse_strings_in_paragraph(paragraph):
    strings = paragraph.split()
    reversed_strings = [reverse_string(s) for s in strings]
    return " ".join(reversed_strings)


paragraph =input()
reversed_paragraph = reverse_strings_in_paragraph(paragraph)
print(reversed_paragraph)