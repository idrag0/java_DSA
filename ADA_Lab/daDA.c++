#include <iostream>
#include <vector>
#include <algorithm>

std::vector<int> missingNumbers(std::vector<int> arr, std::vector<int> brr) {
    std::vector<int> missing;
    
    // Sort both arrays
    std::sort(arr.begin(), arr.end());
    std::sort(brr.begin(), brr.end());
    
    int i = 0, j = 0;
    
    // Traverse both arrays and find missing elements
    while (i < arr.size() && j < brr.size()) {
        if (arr[i] == brr[j]) {
            i++;
            j++;
        } else {
            missing.push_back(brr[j]);
            j++;
        }
    }
    
    // Add remaining elements from brr if any
    while (j < brr.size()) {
        missing.push_back(brr[j]);
        j++;
    }
    
    return missing;
}

int main() {
    int n, m;
    std::cin >> n;
    
    std::vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        std::cin >> arr[i];
    }
    
    std::cin >> m;
    
    std::vector<int> brr(m);
    for (int i = 0; i < m; i++) {
        std::cin >> brr[i];
    }
    
    std::vector<int> result = missingNumbers(arr, brr);
    
    for (int i = 0; i < result.size(); i++) {
        std::cout << result[i] << " ";
    }
    
    return 0;
}