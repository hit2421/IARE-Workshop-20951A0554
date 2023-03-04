import threading

def reverse_string(string):
    return string[::-1]

def reverse_paragraph(paragraph):
    # Split the paragraph into a list of strings
    strings = paragraph.split()

    # Define a list to hold the results
    results = [''] * len(strings)

    # Define a function that reverses a single string and stores the result in the results list
    def reverse_string_and_store_result(i):
        results[i] = reverse_string(strings[i])

    # Create a thread for each string and start them all simultaneously
    threads = []
    for i in range(len(strings)):
        thread = threading.Thread(target=reverse_string_and_store_result, args=(i,))
        threads.append(thread)
        thread.start()

    # Wait for all threads to complete before returning the results
    for thread in threads:
        thread.join()

    # Join the reversed strings back into a paragraph
    return ' '.join(results)

paragraph =input()
reversed_paragraph = reverse_paragraph(paragraph)
print(reversed_paragraph)
