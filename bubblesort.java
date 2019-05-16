public static void bubblesort (int v [ ]) {
  int end = v.length - 2;
  int pos = 0;
  boolean swap = true;
  int value;
  int i;
  while (swap == true) {
    swap = false;
    for (i = 0; i <= end; i++) {
      if (v[i] > v[i+1]) {
        value = v[i]; v[i] = v[i+1]; v[i+1] = value;
        pos = i; swap = true;
      }
    }
    end = pos-1;
  }
}
