package io.ylab.WalletService.Infrastructure;
import java.util.ArrayList;

/**
 * Это класс <code>AuditCollection</code> слоя io.ylab.WalletService.Infrastructure, отвечающий за хранение и обработку имен файлов
 * <p>
 *     Этот класс содержит закрытое поле списка с именами файлов, метод создания нового файла и выдачи файла.
 * </p>
 */
public class AuditCollection {
    /**
     * Список с именами всех файлов программы
     * <p>
     *     Это поле хранит все имена файлов, которые будут использоваться для ведения аудита каждого игрока.
     * </p>
     */
    private ArrayList <String> ListOfFilesNames;

    /**
     * Этот метод является конструктором класса AuditCollections, иницилизируя пустой список - поле ListOfNames
     */
    public AuditCollection()
    {
        ListOfFilesNames = new ArrayList<>();
    }

    /**
     * Это метод добавление имени нового файла в список имен файлов
     * @param FilesName имя файла, который будет добавлен в список
     */
    public void AddFile (String FilesName)
    {
        ListOfFilesNames.add(FilesName);
    }

    /**
     * @param FilesName имя файла
     * @return boolean true, если FilesName есть в ListOfFilesNames
     */
    public boolean CheckingPresence (String FilesName)
    {
        return ListOfFilesNames.contains(FilesName);
    }
}
